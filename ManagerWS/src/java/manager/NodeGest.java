/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author bruno
 */
public class NodeGest {
    
    private int idNodeGest;
    private String sector;

    //Construtor
    public NodeGest(int idNodeGest, String sector) {
        this.idNodeGest = idNodeGest;
        this.sector = sector;
    }
    
    public NodeGest(){
        this.sector = "";
    }

    public int getIdNodeGest() {
        return idNodeGest;
    }

    public void setIdNodeGest(int idNodeGest) {
        this.idNodeGest = idNodeGest;
    }
    
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
