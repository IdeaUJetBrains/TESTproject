package util;

import org.hibernate.Session;

public class HibernateUtil {
    private static Session session;



    public HibernateUtil(){
        this.session = HibernateSessionFactory.getSessionFactory().openSession();
    }

    public Session getSession(){
        return session;
    }

/*

    public void checkData(String sql) throws Exception {
        ResultSet rs = st.executeQuery(sql);
        ResultSetMetaData metadata = rs.getMetaData();

        for (int i = 0; i < metadata.getColumnCount(); i++) {
            System.out.print("\t"+ metadata.getColumnLabel(i + 1));
        }
        System.out.println("\n----------------------------------");

        while (rs.next()) {
            for (int i = 0; i < metadata.getColumnCount(); i++) {
                Object value = rs.getObject(i + 1);
                if (value == null) {
                    System.out.print("\t       ");
                } else {
                    System.out.print("\t"+value.toString().trim());
                }
            }
            System.out.println("");
        }
    }*/

    public static void shutdown() {
        session.close();
    }

}
