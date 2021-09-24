import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import NavBar from './NavBar';
import Home from './Home';
import Product from './Product';
import Products from './Products';
import User from './User';
import Cart from './Cart';
import Orders from './Orders';
import ProductForm from './ProductForm';
const Welcome = () => {
    return (
        <div>
            <div className="alert alert-info text-center">
                <h1>e-Shop Application</h1>
            </div>
            <hr />
            <Router>

                <div className="row">
                    <div className="col-2">
                        <NavBar />
                    </div>
                    <div className="col-10">
                        <Switch>

                            <Route path="/" exact component={Home} />
                            <Route path="/findAll" component={Products} />
                            <Route path="/find" component={Product} />
                            <Route path="/product-form" component={ProductForm} />
                            <Route path="/user" component={User} />
                            <Route path="/cart" component={Cart} />
                            <Route path="/orders" component={Orders} />

                        </Switch>

                    </div>
                </div>


            </Router>


        </div>
    );
};

export default Welcome;