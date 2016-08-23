package Model;

public class Candidate {
	private Entity entity;
	private double label_edit_distance; 	// range: [0, 1]
	private double popularity;				// P(entity)
	private double label_equals;
	private double label_contains;
	private double label_startwith;
	
	private double sim_desc;
	private double sim_context;
	private double sim_summary;
	private double sim_label_context;
	
	private double score;
	public Candidate(){
		label_edit_distance = 0;
		popularity = 0;
		sim_context = 0;
		sim_summary = 0;
		sim_label_context = 0;
		score = 0;
		label_contains = 0;
		sim_desc = 0;
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public double getLabelEditDistance() {
		return label_edit_distance;
	}
	public void setLabelEditDistance(double sim_label) {
		this.label_edit_distance = sim_label;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	public double getSim_context() {
		return sim_context;
	}
	public void setSim_context(double sim_context) {
		this.sim_context = sim_context;
	}
	public double getSim_summary() {
		return sim_summary;
	}
	public void setSim_summary(double sim_summary) {
		this.sim_summary = sim_summary;
	}
	
	public double getSim_label_context() {
		return sim_label_context;
	}
	public void setSim_label_context(double sim_label_context) {
		this.sim_label_context = sim_label_context;
	}

	
	public double getLabel_edit_distance() {
		return label_edit_distance;
	}

	public void setLabel_edit_distance(double label_edit_distance) {
		this.label_edit_distance = label_edit_distance;
	}

	public double getLabel_equals() {
		return label_equals;
	}

	public void setLabel_equals(double label_equals) {
		this.label_equals = label_equals;
	}

	public double getLabel_startwith() {
		return label_startwith;
	}

	public void setLabel_startwith(double label_startwith) {
		this.label_startwith = label_startwith;
	}

	
	public double getLabel_contains() {
		return label_contains;
	}

	public void setLabel_contains(double label_contains) {
		this.label_contains = label_contains;
	}

	public double getSim_desc() {
		return sim_desc;
	}

	public void setSim_desc(double sim_desc) {
		this.sim_desc = sim_desc;
	}

	@Override
	public String toString() {
		return "Candidate ["
				+ "score=" + score
				+ ", label_edit_distance="
				+ label_edit_distance + ", popularity=" + popularity
				+ ", label_equals=" + label_equals + ", label_contains="
				+ label_contains + ", label_startwith=" + label_startwith
				+ ", sim_desc=" + sim_desc
				+ ", sim_context=" + sim_context + ", sim_summary="
				+ sim_summary + ", sim_label_context=" + sim_label_context
				+ "entity=" + entity 
				+ "]";
	}


	
	
	
}
