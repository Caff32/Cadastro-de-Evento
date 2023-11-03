package com.work.event.controller;


import com.work.event.model.AttEvent;
import com.work.event.model.DadosEvento;
import com.work.event.model.Event;
import com.work.event.repository.EventRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {


    @Autowired
    private EventRepository repository;

    @GetMapping
    public Page<DadosEvento> listar(@PageableDefault(size = 10, sort = {"data"}) Pageable paginacao){
    return repository.findAllByEnableTrue(paginacao).map(DadosEvento::new);
    } /*findAllByEnableTrue Filtro para listar somente ativos, obser classe repository*/

/*
Outros metodos para listar

  public Page<DadosEvento> listar(@PageableDefault(size = 2, sort = {"data"}) Pageable paginacao){
    return repository.findAll(paginacao).map(DadosEvento::new);
    } http://localhost:8080/event?page=3 Exemplo de execucao

 public List<DadosEvento>listar(){
    return repository.findAll().stream().map(DadosEvento::new).toList();
   }
public List<Event>listar(){
   return repository.findAll();
}*/

    @PostMapping
    @Transactional
    public void registerEvent (@RequestBody @Valid DadosEvento dados){
        System.out.println(dados);
        repository.save(new Event(dados));

    }

    @PutMapping
    @Transactional
    public void updateEvent(@RequestBody @Valid AttEvent dados){
        var event = repository.getReferenceById(dados.id());
        event.updateEvent(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        System.out.println(id);
        var event = repository.getReferenceById(id);
        event.desabilitar();
    }
/*    public void delete(@PathVariable long id){
        repository.deleteById(id);*/


}
