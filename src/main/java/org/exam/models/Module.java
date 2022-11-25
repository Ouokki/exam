package org.exam.models;

public class Module {
    private String codeModule;
    private String intitule;
    private String description;

    public String getCodeModule() {
        return codeModule;
    }

    public void setCodeModule(String codeModule) {
        this.codeModule = codeModule;
    }

    @Override
    public String toString(){
        return  intitule + description;
    }


    public boolean equals(Module module){
        if(module != null){
            if(module.getCodeModule().equals(codeModule))
                return true;
        }
        return false;
    }
}
