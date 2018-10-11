package com.gitjaipur.jigyasa;

class ItemObject {
    private int photo;
    private String text;

    public ItemObject( int photo,String  text) {

        this.photo = photo;
        this.text = text;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public void setText(String text){
        this.text=text;
    }
    public String getText(){
        return text;
    }

}
