package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org. springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
@Service
public class NewfileServiceImpl implements NewfileService{
   
    private final NewfileRepo rep;
    private NewfileServiceImpl(NewfileRepo rep){
        this.rep=rep;

    }
    @Override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);
 
    }

    @Override
    public NewfileEntity getidval(Long id) {
        return rep.findbyId(id);

    }
    @Override
    public List<NewfileEntity> getall() {
        return rep.findAll();

    }
    @Override
    public NewfileEntity update(Long id, NewfileEntity newfile) {
        NewfileEntity ex=getidval(id);
        ex.setName(newfile.getName());
        ex.setEmail(newfile.getEmail());
        return rep.save(ex);

    } 

    @Override
    public void delete(Long id) {
        rep.delete(id);
    }
}