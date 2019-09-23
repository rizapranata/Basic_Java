class Sorting{

    public static int min=0,kecil=0;

    public static void main(String[] args){
        int array[] = {1,25,5,6,15,12};

        for(int inisial = 0; inisial < array.length; inisial++){
            min = inisial;
            for(int inisial2 = inisial + 1; inisial2 < array.length; inisial2++){
                if(array[min] > array[inisial2]){
                    min = inisial2;
                }
                kecil = array[min];
                array[min] = array[inisial];
                array[inisial] = kecil;
            }
            System.out.println(array[inisial]);
        }
    }
}