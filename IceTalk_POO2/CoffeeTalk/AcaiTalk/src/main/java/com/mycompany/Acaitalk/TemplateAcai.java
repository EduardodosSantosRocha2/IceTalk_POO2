package com.mycompany.Acaitalk;

public class TemplateAcai {
    
    IAcai acai;
    public TemplateAcai(IAcai acai){
        this.acai = acai;
    }
    
    public void execute(){
        acai.make();
    }
    public void pack(){
        acai.pack();
    }
    public void price(){
        acai.price();
    }
     public void ReadyRequest(){
         execute();
         pack();
         price();
     }

}

