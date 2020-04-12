class Receipt {

    List<Item> itemList = new ArrayList();

    public addItem(Item item){
        itemList.add(item);
    }
    public removeItem(Item item){
        itemList.remove(item);
    }
}