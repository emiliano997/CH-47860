package edu.coderhouse.jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManagerFactory;

import edu.coderhouse.jpa.entity.Cliente;

@Service
public class DaoFactory {

  @Autowired
  private SessionFactory sessionFactory;

  public DaoFactory(EntityManagerFactory factory) {
    this.sessionFactory = factory.unwrap(SessionFactory.class);
  }

  public void create(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.persist(obj);
    session.getTransaction().commit();
  }

  public void update(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.merge(obj);
    session.getTransaction().commit();
  }

  public Cliente getCliente(Cliente cliente) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Cliente clienteGuardado = session.get(Cliente.class, cliente.getId());
    session.getTransaction().commit();
    return clienteGuardado;
  }
}
