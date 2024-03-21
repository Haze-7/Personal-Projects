import Header from './Header.jsx' // import componentName from FilePath/Location
//can now use Header Component within App Component
import Footer from './Footer.jsx'

function App() {
  return( 
    <> {/*Fragment start */}
    <Header> 
    </Header> {/*header component / or shorthand (<Header/>)*/}
    <Footer/> {/*shorthand */}
    </> //fragment end
  );
}

export default App

{/*easy reference React comment*/}