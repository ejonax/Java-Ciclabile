package package1;

public class CicloArray {

   
    private int[] array;
    private int index;

    public CicloArray(int[] array){
        this.array=array;
    }

    public boolean hasAncoraElementi() {
        if  ( index<array.length){
            return true;
        } else{
            return false;
        }
    }

    public int getElementoSuccessivo(){
        if (!hasAncoraElementi()){
            System.out.println("Siamo alla fine dell'array, non ci sono elementi da ritornare");
           
        }
        int i=index;// se stampo array[index] allora si stampera index ++ che abbiamo incrementato una incrementazione prima
        index++;
        return array[i];
    }
}
