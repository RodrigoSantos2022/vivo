package com.rafaffs.dados.model;


import bean.dsl.Commands;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;


public class ConexaoBancoDados extends Commands {

    private EntityManagerFactory entityManagerFactory;
    private Connection connection;

    // Método para estabelecer a conexão com o banco de dados
    public void conectar() {
        try {
            // Configurar o driver JDBC do banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conectar ao banco de dados
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC",
                    "root", "0000");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar as informações de massa do produto no banco de dados
    public List<Bdd_massas> buscarMassas() {
        List<Bdd_massas> massasList = new ArrayList<>();

        try {
            // Preparar a consulta SQL
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM massas");

            // Executar a consulta e obter o resultado
            ResultSet resultSet = statement.executeQuery();

            // Transformar cada linha do resultado em um objeto Bdd_massas e adicioná-lo à lista
            while (resultSet.next()) {
                Bdd_massas massa = new Bdd_massas();
                massa.setIDMASSAS(resultSet.getInt("IDMASSAS"));
                massa.setCUSTOMIZATION(resultSet.getString("CUSTOMIZATION"));
                massa.setDISPLAY(resultSet.getString("DISPLAY"));
                massa.setDISPLAY_RESOLUTION(resultSet.getString("DISPLAY_RESOLUTION"));
                massa.setDISPLAY_SIZE(resultSet.getString("DISPLAY_SIZE"));
                massa.setMEMORY(resultSet.getString("MEMORY"));
                massa.setOPERATING_SYSTEM(resultSet.getString("OPERATING_SYSTEM"));
                massa.setPROCESSOR(resultSet.getString("PROCESSOR"));
                massa.setTOUCHSCREEN(resultSet.getString("TOUCHSCREEN"));
                massa.setWEIGHT(resultSet.getString("WEIGHT"));
                massa.setCOLOR(resultSet.getString("COLOR"));
                massasList.add(massa);
            }

            // Fechar o statement e o resultado
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return massasList;
    }

    // Método para atualizar as informações de massa do produto no banco de dados
    public void atualizarMassas(Bdd_massas massa) {
        try {
            // Preparar a consulta SQL
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE massas SET CUSTOMIZATION=?, DISPLAY=?, DISPLAY_RESOLUTION=?, DISPLAY_SIZE=?, MEMORY=?, OPERATING_SYSTEM=?, PROCESSOR=?, TOUCHSCREEN=?, WEIGHT=?, COLOR=? WHERE IDMASSAS=?");

            // Definir os parâmetros da consulta
            statement.setString(1, massa.getCUSTOMIZATION());
            statement.setString(2, massa.getDISPLAY());
            statement.setString(3, massa.getDISPLAY_RESOLUTION());
            statement.setString(4, massa.getDISPLAY_SIZE());
            statement.setString(5, massa.getMEMORY());
            statement.setString(6, massa.getNAME_PRODUCT());
            statement.setString(7, massa.getWEIGHT());
            statement.setString(8, massa.getCOLOR());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public EntityManager getEntityManager() {
//        if (entityManagerFactory == null) {
//            entityManagerFactory = Persistence.createEntityManagerFactory("massas");
//        }
//        return entityManagerFactory.createEntityManager();
//    }

    //fechar conexao com o banco de dados
    public void fecharConexao() {
        try {
            if (connection != null) {
                connection.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}



