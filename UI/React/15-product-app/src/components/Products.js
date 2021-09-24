import { useState, useEffect } from 'react';
import productOperations from '../services/ProductHttpService';
import {Link} from 'react-router-dom';
const Products = () => {
    const [products, setProducts] = useState([]);
    let { loadAllProducts } = productOperations();

    useEffect(() => {
        loadAllProducts().then(products => {
            console.log(products.data);
            setProducts(products.data);
        })
    }, [])

    function renderProducts() {
        return products.map(product => {
            return (
                <tr>
                    <td>
                        <Link to={`find/${product.productId}`}>
                         {product.productId} 
                         </Link>
                         </td>
                    <td> {product.title} </td>
                    <td> {product.price} </td>
                    <td> {product.description} </td>
                </tr>

            )
        })
    }

    return (
        <div>

            <h1>Products-V1</h1> <hr />
            <div>
                <input type="text" placeholder="Filter data" />
            </div>
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
                    {renderProducts()}
                </tbody>
            </table>
        </div>
    );
};

export default Products;