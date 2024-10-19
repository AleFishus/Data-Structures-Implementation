public class ArrayListString{

    public String[] list;
    public int size;
    public static int INITIAL_SIZE = 8;

    // Instantiate the list  O(1)
    ArrayListString(){
        this(INITIAL_SIZE);
    }

    // Instantiate the list defined size O(1)
    ArrayListString(int arrayInitialLength){
        this.list = new String[arrayInitialLength];
    }

    // Increase the size of the array O(n)
    private void increase(){
        String[] newList = new String[list.length * 2];
        for(int i = 0 ; i < list.length ; i++){
            newList[i] = list[i];
        }
        this.list = newList;
    }

    // Add element at the end O(1)
    public void add(String element){
        if(list.length == size){
            increase();
        }
        list[size] = element;
        size++;
    }

    // Add element at specific position O(n)
    public void add(String element, int position){
        if(position > size){
            this.add(element);
        }else{
            if(list.length == size){
                increase();
            }
            String[] tempList = new String[list.length];
            int cont = 0;
            tempList[position] = element;
            for(int i = 0 ; i < size + 1 ; i++){
                if(i == position){
                    cont++;
                }
                tempList[cont] = list[i];
                cont++;
            }
            list = tempList;
            size++;
        }
    }

    // Retrieve an element from a determinated position O(1)
    public String get(int position){
        if(position < size){
            return list[position];
        }else{
            return list[size];
        }
    }

    // Update element O(1)
    public void update(String element, int position){
        if(position > size){
            list[size] = element;
        } 
        list[position] = element;
    }

    // Remove last element O(1)
    public String delete(){
        String temp = list[size - 1];
        size--;
        list[size] = null;
       
        return temp;
    }

    // Retrieve the array O(1)
    public String[] getArray(){
        return list;
    }


}