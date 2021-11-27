package orderSystem.Entity;



import orderSystem.Room;
import orderSystem.behavior.Card;
import orderSystem.behavior.Activity;

/**
 * @program: algorithm
 * @description:
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-27 12:56
 **/
public class BusinessRoom extends Room {

    public double price = 100.00;

    public BusinessRoom(Card card, Activity activity) {
        super(card, activity);
    }

    @Override
    public void getDiscount() {
        System.out.println("-------商务房:" + price + "--------");
        double discount = card.getDiscount();
        System.out.println("用户权益优惠:" + (price - price*discount));
        double activityDiscount = activity.getActivityDiscount(price * discount);
        System.out.println("折扣后金额:" + (activityDiscount));
    }
}
