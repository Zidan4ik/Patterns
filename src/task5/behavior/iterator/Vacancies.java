package task5.behavior.iterator;

public class Vacancies implements Collection{
    private String[] vacancies;
    public Vacancies(String[] vacancies) {
        this.vacancies = vacancies;
    }

    class IteratorImp implements Iterator{
        private int position;
        @Override
        public boolean hasNext() {
            return position< vacancies.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return vacancies[position++];
            }
            return null;
        }
    }


    @Override
    public Iterator getIterator() {
        return new IteratorImp();
    }

}
