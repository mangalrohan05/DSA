import java.util.ArrayDeque;
import java.util.Deque;

class Stock{
    int price;
    int span;

    public Stock(int price, int span){
        this.price = price;
        this.span = span;
    }
}

class StockSpanner {

    private Deque<Stock> st;

    public StockSpanner() {
        st = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        while (!st.isEmpty() && st.peek().price <= price) {
            span += st.pop().span;
        }

        st.push(new Stock(price, span));

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */