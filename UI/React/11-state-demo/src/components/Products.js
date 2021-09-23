import { useState, useEffect } from 'react';
const Products = ({ product, cartF1,tot }) => {
    console.log(">>>>");
    console.log(product);
    const [quantity, setQuantity] = useState(0);
    const [price, setPrice] = useState(product.price);

    useEffect(() => {
        cartF1( (price * quantity));
    }, [quantity])


    return (
        <div>
            <div className="card-header">{product.name}</div>
            <div className="card-body">
                <h4>Price: {product.price}</h4>
                <h4>Quantity: {quantity}</h4>
                <h4>Amount: {product.price * quantity}</h4>
                <hr />
                <input type="number" onChange={(e) => setQuantity((Number.parseInt(e.target.value)))} /> <br />
                <button onClick={() => setQuantity(quantity + 1)} className="btn btn-primary" style={{ margin: '5px' }}>+</button>
                {quantity > -0 ? <button onClick={() => setQuantity(quantity - 1)} className="btn btn-primary" style={{ margin: '5px' }}>-</button> : null}
            </div>

        </div>
    );
};

export default Products;