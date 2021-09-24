import { useState, useEffect } from 'react';
import productOperations from '../HttpService';

const Product = () => {

    const [product, setProduct] = useState({});

    let { findProductsById } = productOperations();

    useEffect(() => {
        findProductsById(4)
            .then(product => setProduct(product.data))
            .catch(error => {
                console.log(">> error " + error);
            })
    }, [])

    return (
        <div>

            <hr />
            <table className="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> {product.productId} </td>
                        <td> {product.title} </td>
                        <td> {product.price} </td>
                        <td> {product.description} </td>
                    </tr>
                </tbody>
            </table>

        </div>
    );
};

export default Product;