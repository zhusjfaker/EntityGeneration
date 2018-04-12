package core

import org.apache.ibatis.datasource.pooled.PooledDataSource
import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory

class EntiyFactory {

    companion object {

        val driver = "com.mysql.jdbc.Driver"
        val url = "jdbc:mysql://100.73.17.8:3306/bpm01"
        val username = "root"
        val password = "root123456"

        fun build(): SqlSessionFactory? {
            val dataSource = PooledDataSource(driver, url, username, password);
            val transactionFactory = JdbcTransactionFactory()
            val environment = Environment("development", transactionFactory, dataSource)
            val config = Configuration(environment)
            config.addMappers("mapper")
            val sqlSessionFactory = SqlSessionFactoryBuilder().build(config)
            return sqlSessionFactory
        }

        val factory = build()
    }

}