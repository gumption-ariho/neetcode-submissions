class LinkedList {
ArrayList<Integer>arrayList;
    public LinkedList() {
arrayList=new ArrayList<>();
    }

    public int get(int index) {
        if(index>=arrayList.size()||arrayList.isEmpty()||index<0){
            return -1;
        }
        return arrayList.get(index);
    }

    public void insertHead(int val) {
        arrayList.add(0,val);
    }

    public void insertTail(int val) {
        arrayList.add(val);
    }

    public boolean remove(int index) {
        if(index>=arrayList.size()||arrayList.isEmpty()||index<0){
            return false;
        } 
        arrayList.remove(index);
        return true;
    }

    public ArrayList<Integer> getValues() {
        return arrayList;
    }
}
