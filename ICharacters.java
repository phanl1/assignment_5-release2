
/*
    Le Phan
    assignment 5
    December 7th, 2021
    
*/

package assignment_5;

public interface ICharacters {
      
    
    /**
     * 
     * @return 
     */
    public int getHealth();
    
    /**
     * 
     * @param attack 
     */
    public void setHealth(int attack);
    
    
    /**
     * 
     * @return 
     */
    public int getAttack();
    
    
    
    /**
     * 
     * @param health 
     */
    public void isDead(int health);
    
    
}
