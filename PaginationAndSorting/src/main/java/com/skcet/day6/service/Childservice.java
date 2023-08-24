package com.skcet.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.skcet.day6.model.Childmodel;
import com.skcet.day6.repository.Childrepo;

@Service
public class Childservice {
@Autowired
Childrepo crepo;

public Childmodel savedetails(Childmodel f)
{
	return crepo.save(f);
}


public List<Childmodel> getChild()
{
	return crepo.findAll();
}

public List<Childmodel> sortDes(String name)
{
	return crepo.findAll(Sort.by(name).descending());
}
public List<Childmodel>pagination(int pageNu,int pageSize)
{
	Page<Childmodel>cont=crepo.findAll(PageRequest.of(pageNu, pageSize));
	return cont.getContent();
}
public List<Childmodel>paginationAndSorting(int pageNu,int pageSize,String name)
{
	Page<Childmodel>cont1=crepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(name)));
	return cont1.getContent();
}

}
