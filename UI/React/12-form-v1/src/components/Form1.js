import { useState, useEffect } from 'react';

const Form1 = () => {

    const [product, setProduct] = useState(
        {
            name: '',
            price: ''
        }
    );

    const [errors, setErrors] = useState(false);
    const [isFormSubmited, setIsFormSubmited] = useState(false)



    useEffect(() => {

        if (Object.keys(errors).length === 0 && isFormSubmited) {
            console.log(">>> form is clear <<<");
            console.log(product);
        }


    }, [errors])



    function validateProductForm(product) {

        let errors = {};

        if (!product.name.trim()) {
            errors.name = 'Product Name is required';
        }

        if (!product.price.trim()) {
            errors.price = 'Product Price is required';
        }

        return errors;

    }

    function handleSubmit(e) {
        e.preventDefault();
        // validate form
        setErrors(validateProductForm(product));
        setIsFormSubmited(true);
        // console.log(product);
    }

    function handleChange(e) {
        let { name, value } = e.target;

        setProduct(
            {
                ...product,
                [name]: value
            }
        );

    }

    return (
        <div>

            <div>
                <form onSubmit={e => handleSubmit(e)}>
                    <div>
                        <label>Product Name</label>
                        <input
                            type="text"
                            name="name"
                            onChange={e => handleChange(e)}
                        />
                        <span>{errors.name}</span>
                    </div>

                    <div>
                        <label>Product Price</label>
                        <input
                            type="text"
                            name="price"
                            onChange={e => handleChange(e)}
                        />
                        <span>{errors.price}</span>
                    </div>
                    <div>
                        <button>Submit</button>
                    </div>

                </form>
            </div>

        </div>
    );
};

export default Form1;