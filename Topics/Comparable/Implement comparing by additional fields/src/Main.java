class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        // add your code here!
        int flag = compare(this.getSize(), otherArticle.getSize());
        if (flag == 0){
            return compare(getTitle(), otherArticle.getTitle());
        }else{
            return flag;
        }
    }

    private int compare(int size, int size1) {
        return Integer.compare(size, size1);
    }

    private int compare(String title, String title1){
        return title.compareTo(title1);
    }
}