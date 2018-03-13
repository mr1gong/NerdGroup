import java.io.Serializable;
import java.util.ArrayList;

import exceptions.LevelNotEditableException;
import exceptions.ValueOutOfBoundsException;
import gameObjects.DynamicObject;
import gameObjects.StaticObject;
/**
 * Class for making a game level. Game level contains scenery and dynamic objects. It can be saved as a file.
 * @author Marek Makovec
 * @version 1.0
 */
public class GameLevel implements Serializable {
	
	private String name;
	private String creator;
	private int difficulty;
	private String songName;
	
	private ArrayList<StaticObject> scenery;
	private ArrayList<DynamicObject> dynamic;
	private boolean editable;
	/**
	 * 
	 * @param name
	 * @param difficulty
	 */
	public GameLevel(String name,String creator, int difficulty) {
		
		this.name = name;
		this.creator = creator;
		this.difficulty = difficulty;
		this.editable = true;
		
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public ArrayList<StaticObject> getScenery() {
		return scenery;
	}

	public ArrayList<DynamicObject> getDynamic() {
		return dynamic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) throws ValueOutOfBoundsException {
		if(difficulty >=0 || difficulty <=10) {this.difficulty = difficulty;}
		else {throw new ValueOutOfBoundsException();}
		
	}
	public void addScenery(StaticObject object) throws LevelNotEditableException {
		if(editable) {
		scenery.add(object);
		}
		else {throw new LevelNotEditableException();}
	}
	public void addDynamic(DynamicObject object) throws LevelNotEditableException {
		if(editable) {
		dynamic.add(object);
		}
		else {throw new LevelNotEditableException();}
	}
	
}
