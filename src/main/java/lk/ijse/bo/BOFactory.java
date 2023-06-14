//package lk.ijse.bo;
//
//import lk.ijse.bo.custom.impl.AttendanceBOImpl;
//import lk.ijse.bo.custom.impl.CustomerBOImpl;
//
//public class BOFactory {
//    private static BOFactory boFactory;
//    private BOFactory(){
//    }
//    public static BOFactory getBoFactory(){
//        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
//    }
//
//    public enum BOTypes{
//        CUSTOMER,ATTENDANCE,CARTORDER,CARTSUPPLIER,CARTSUPPLIERORDER,EMPLOYEE,ITEM,ORDER,SUPPLIER
//    }
//
//    public SuperBo getBo(BOTypes types){
////        switch (types){
////            case CUSTOMER:
////                return new CustomerBOImpl();
////            case ATTENDANCE:
////                return new AttendanceBOImpl();
////            case CARTORDER:
////                return new CartO
////            case CARTSUPPLIER:
////                return new
////            default:
////                return null;
//        }
//    }
//
//}
