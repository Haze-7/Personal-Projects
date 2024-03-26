function Header() {
    //can write combination of HTML & JavaScript
    return( //within, can write pure HTML 
    <header>
        <h1>My Website</h1>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
        <hr></hr> {/*horizontal Rule */}
    </header>
    );

}

//react components can only return 1 element
//but, you can create children elements within
export default Header