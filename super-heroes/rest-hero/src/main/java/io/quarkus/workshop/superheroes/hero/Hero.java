/**
 * 
 */
package io.quarkus.workshop.superheroes.hero;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * @author stanley
 *
 */
@Entity
public class Hero extends PanacheEntity {

	@NotNull
	@Size(min = 3, max = 50)
	public String name;
	
	public String otherName;
	
	@NotNull
	@Min(1)
	public int level;
	
	public String picture;
	    
    @Column(columnDefinition = "TEXT")
    public String powers;
    
    @Override
    public String toString() {
        return "Hero{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", otherName='" + otherName + '\'' +
            ", level=" + level +
            ", picture='" + picture + '\'' +
            ", powers='" + powers + '\'' +
            '}';
    }
    
    public static Hero findRandom() {
        long countHeroes = Hero.count();
        Random random = new Random();
        int randomHero = random.nextInt((int) countHeroes);
        return Hero.findAll().page(randomHero, 1).firstResult();
    }
}
