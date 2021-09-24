import React from 'react';
import { Link } from 'react-router-dom';
const NavBar = () => {
    return (
        <div>

            <ul className="nav flex-column">
                <li className="nav-item">
                    <Link className="nav-link" to="/"> Home </Link>
                </li>
                <li className="nav-item">

                    <Link className="nav-link" to="/findAll"> Display </Link>

                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/product-form"> Add Product </Link>
                </li>

                <li className="nav-item">
                    <Link className="nav-link" to="/find"> Find Product </Link>

                </li>

                <li className="nav-item">
                    <Link className="nav-link" to="/cart"> Cart </Link>

                </li>

                <li className="nav-item">
                    <Link className="nav-link" to="/user"> User </Link>

                </li>

                <li className="nav-item">
                    <Link className="nav-link" to="orders"> Order Details </Link>

                </li>

            </ul>

        </div>
    );
};

export default NavBar;