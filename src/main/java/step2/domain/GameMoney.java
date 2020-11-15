package step2.domain;

import step2.exception.NotDivideZeroException;

import java.util.Objects;

public class GameMoney {
    private final int price;
    public GameMoney(int price) {
        this.price = price;
    }

    public GameMoney sum(GameMoney gameMoney) {
        return new GameMoney(this.price + gameMoney.price);
    }

    public double splitRate(GameMoney investMoney){
        validPrice(investMoney.price);

        return (double)price/ investMoney.price;
    }

    private void validPrice(int price) {
        if(price == 0){
            throw new NotDivideZeroException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMoney gameMoney = (GameMoney) o;
        return price == gameMoney.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

}
