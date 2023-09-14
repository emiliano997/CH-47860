package edu.coderhouse.jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.jpa.entity.Alumno;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

@Service
public class DaoFactory {

  @Autowired
  private SessionFactory sessionFactory;

  public DaoFactory(EntityManagerFactory entityManagerFactory) {
    this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
  }

  public void create(Object obj) throws Exception {
    Session session = this.sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.save(obj); // Actualizar
    session.getTransaction().commit();

  }

  public List<Alumno> getAlumnos() {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Query<Alumno> query = session.createQuery("SELECT al FROM Alumno al");
    List<Alumno> listaAlumnos = query.list();
    session.getTransaction().commit();
    return listaAlumnos;
  }

  public void update(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.saveOrUpdate(obj);
    session.getTransaction().commit();
  }

  public Alumno getAlumnoByDni(Long dni) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    TypedQuery<Alumno> query = session.createQuery("SELECT al FROM Alumno al WHERE al.dni = ?1", Alumno.class);
    Alumno alumno = query.setParameter(1, dni).getSingleResult();
    session.getTransaction().commit();
    return alumno;
  }

}
