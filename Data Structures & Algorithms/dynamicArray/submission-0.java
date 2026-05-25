
class DynamicArray {
private int capacity;
private int size=0;
int[]arr;
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        arr=new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
            arr[i]=n;
    }

    public void pushback(int n) {
        if(size>=capacity){
            resize();
        }
        arr[size++]=n;
    }

    public int popback() {
        int x =arr[size-1];
        size--;
        return x;
    }

    private void resize() {
            this.capacity=this.capacity*2;
         int  []newArr=new int[this.capacity];
         System.arraycopy(arr,0,newArr,0,arr.length);
         arr=newArr;

    }

    public int getSize() {
        return this.size;

    }

    public int getCapacity() {
        return this.capacity;
    }
}
