class OrderedStream {

    String[] arr;
    int pt=0;
    public OrderedStream(int n) {
        arr=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        arr[idKey-1]=value;
        List<String> list=new ArrayList<>();
        while(pt<arr.length && arr[pt]!=null){
            list.add(arr[pt++]);
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */