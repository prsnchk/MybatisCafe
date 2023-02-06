package service;

import mapper.CustomerMapper;

import mapper.PaymentTypeMapper;
import model.Customer;

import model.DeliveryProvider;
import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class CustomerService {
    public Customer getCustomerById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            return customerMapper.getCustomerById(id);
        } finally {
            sqlSession.close();
        }
    }

    public void insertCustomer(Customer customer) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            customerMapper.saveCustomer(customer);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void updateCustomer(Customer customer) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            customerMapper.updateCustomer(customer);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void deleteCustomer(Customer customer) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            customerMapper.deleteCustomer(customer);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Map<Integer, Customer> getAllCustomer() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            return customerMapper.getAllCustomer();
        } finally {
            sqlSession.close();
        }
    }
}

