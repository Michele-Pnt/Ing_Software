package ImplementazioneSortable;

public class SortedCollection implements Sortable{

    private Sorter s;
    public void SortedCollection(){
        s = new QuickSorter();
    }

    public void add(){
    }

    public void get(){
    }   

    public void remove(){
    }

    public void sort(Sorter sender){
        s.sort(this);
    }

    @Override
    public boolean compare() {
       return false;
    }

    @Override
    public void swap() {
        
    }

    @Override
    public int count() {
        return 0;
    }

}
