import { useEffect, useState } from 'react';
import productOperations from '../services/ProductHttpService';

const Product = (props) => {

    let { params } = props.match;
    let { productId } = params;

    const [product, setProduct] = useState({});
    let { findProductsById } = productOperations();

    useEffect(() => {
        findProductsById(productId)
            .then(product => setProduct(product.data))
            .catch(error => {
                console.log(">>> error " + error);
            })
    }, [])

    return (
        <div>
            <h3>Product</h3>
            <hr />
            <br />
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
                        <td>
                                {product.productId}
                        </td>
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