package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

    private String text;
    private int likes;
    private boolean featured;

    /*
     * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
     * forma adecuada
     */
    public WallPostImpl () {
    	this.text="Undefined post";
    	this.featured=false;
    	this.likes=0;
    }
    @Override
    public String toString() {
        return "WallPost {" +
                "text: " + getText() +
                ", likes: '" + getLikes() + "'" +
                ", featured: '" + isFeatured() + "'" +
                "}";
    }

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text=text;
		
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		likes++;
		
	}

	@Override
	public void dislike() {
		if (likes>0) 
			likes--;
		
		
		
	}

	@Override
	public boolean isFeatured() {
		return featured;
	}

	@Override
	public void toggleFeatured() {
		if (featured) {
			featured=false;
		}else {
			featured=true;
		}
	}

}
