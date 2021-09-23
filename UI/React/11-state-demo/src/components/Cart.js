import React from 'react';
import { useState, useEffect } from 'react';
import Products from './Products';

const Cart = () => {

    const [cartTotalPrice, setCartTotalPrice] = useState(0);

    let products = [
        { id: 'P001', name: 'Laptop', price: 100 },
        { id: 'P002', name: 'Mobile', price: 50 },
        { id: 'P003', name: 'Mouse', price: 10 }
    ]

    function renderProducts() {
        return products.map((product) => {
            return (
                <div className="card mt-3">
                  <Products product={product} cartF1={setCartTotalPrice} tot={cartTotalPrice}/>
                </div>
            )
        })
    }


    useEffect(() => {
       // setCartTotalPrice(quantity * price);
    }, [])

    return (

        <div className="row">
            <div className="col-6">

                {renderProducts()}
            </div>

            <div className="col-4">
                <div style={{ float: 'right' }}>
                    <div className="card">
                        <div className="card-header"><h3>Cart Items</h3></div>
                        <div className="card-body">
                            <div className="card-text">
                                <h3>Order Summary</h3>

                                <hr />
                                <h3>Total Bill: {cartTotalPrice}</h3>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>


    );
};

export default Cart;