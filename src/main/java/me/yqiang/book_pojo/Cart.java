package me.yqiang.book_pojo;

public class Cart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cart.cart_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    private Long cartId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cart.user_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cart.cartdata
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    private String cartdata;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cart.cart_id
     *
     * @return the value of t_cart.cart_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public Long getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cart.cart_id
     *
     * @param cartId the value for t_cart.cart_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cart.user_id
     *
     * @return the value of t_cart.user_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cart.user_id
     *
     * @param userId the value for t_cart.user_id
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cart.cartdata
     *
     * @return the value of t_cart.cartdata
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public String getCartdata() {
        return cartdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cart.cartdata
     *
     * @param cartdata the value for t_cart.cartdata
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    public void setCartdata(String cartdata) {
        this.cartdata = cartdata == null ? null : cartdata.trim();
    }
}