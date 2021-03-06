package ca.jrvs.apps.trading.model.domain;

public class Quote implements Entity<String> {

  private String ticker;
  private Double lastPrice;
  private Double bidPrice;
  private Integer bidSize;
  private Double askPrice;
  private Integer askSize;

  public Quote(String ticker, Double lastPrice, Double bidPrice, Integer bidSize,
      Double askPrice, Integer askSize) {
    this.ticker = ticker;
    this.lastPrice = lastPrice;
    this.bidPrice = bidPrice;
    this.bidSize = bidSize;
    this.askPrice = askPrice;
    this.askSize = askSize;
  }

  public Quote() {
  }

  @Override
  public String getId() {
    return ticker;
  }

  @Override
  public void setId(String s) {
    ticker = s;
  }

  public String getTicker() {
    return ticker;
  }

  public void setTicker(String s) {
    ticker = s;
  }

  public Double getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public Integer getBidSize() {
    return bidSize;
  }

  public void setBidSize(Integer bidSize) {
    this.bidSize = bidSize;
  }

  public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public Integer getAskSize() {
    return askSize;
  }

  public void setAskSize(Integer askSize) {
    this.askSize = askSize;
  }
}
