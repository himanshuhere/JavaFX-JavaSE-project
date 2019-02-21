# JavaFX-JavaSE-project

## ongoing..



<html>
    <head>
            <link rel="stylesheet" type="text/css" href="css.css">
            <link  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

            <link  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">

            <link  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js">

    </head>
    <body>
<div class="container">
    
        <h1>Registration Form</h1>
           
                  <form action="#" onsubmit="if (this.MyCheckbox.checked == false) { alert ('You didn\'t choose any of the checkboxes!'); return false; } else { return true; }">

      <div  class= "row" >
        <div class="col-25">
          <label for="fname">First Name</label>
        </div>
        <div class="col-75">
          <input type="text" id="fname" name="fname" placeholder="Your last name.." required>
        </div>
      </div>
      <div class="row">
        <div class="col-25">
          <label for="lname">Last Name</label>
        </div>
        <div class="col-75">
          <input type="text" id="lname" name="lname" placeholder="Your last name.." required>
        </div>
      </div>
      <div class="row">
            <div class="col-25">
              <label for="phone">Phone</label>
            </div>
            <div class="col-75">
              <input type="number" id="phone" name="phone" placeholder="Your phone number.." required>
            </div>
          </div>
          <div class="row">
                <div class="col-25">
                  <label for="phone">Email</label>
                </div>
                <div class="col-75">
                  <input type="email" id="email" name="email" placeholder="Your email.." required>
                </div>
              </div>
              
      <div class="row">
        <div class="col-25">
          <label for="gender">Gender</label>
        </div>
        <div class="col-75">
          <select id="country" name="gender">
                <option value="default">Select Gender</option>

            <option value="Male">Male</option>
            <option value="Female">Female</option>
        
          </select>


        </div>
      </div>
      <div class="row">
            <div class="col-25">
              <label for="phone">Get Location</label>
            </div>
            <div class="col-75">
                    <button class="btn-primary" onclick="getLocation()" style="    background: white;
                    width: 164px;
                    height: 39px;
                    border-radius: 7px;
                    border: solid white 0.5px 0.5px;
                    border: solid white;">Get</button>
                </div>
          </div>
      <div class="row">
            <div class="col-25">
              <label for="phone">Get Location</label>
            </div>
            <div class="col-75">
                    <p><input type="CHECKBOX" id="check"  name="MyCheckbox" value="This..."> Agree and continue..</p>
                </div>
          </div>



      
      <div class="row">
        <input type="submit" value="Submit" id="ss" >
      </div>
    </form>
    
  </div>
</body>

<script>
    
        function validate(){
            var check = document.getElementById("#check");

            if(!check.checkbox.checked)
{
    alert('You must agree to the terms first.');
    
}
else{
    var s = document.getElementById("#ss");
    s.submit();
}
        }
        
        
        function getLocation() {
          if (navigator.geolocation) {
            navigator.geolocation.watchPosition(showPosition);
          } 
          else { 
alert("Geolocation is not supported by this browser.");
          }
        }
            
        function showPosition(position) {
            alert("Latitude: " + position.coords.latitude + 
            "<br>Longitude: " + position.coords.longitude);
        }
        </script>
</html>






* {
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  }
  
  input[type=text], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
  }

  input[type=number], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
  }
  input[type=email], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
  }

  label {
    padding: 12px 12px 12px 0;
    display: inline-block;
  }
  
  input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
  }
  
  input[type=submit]:hover {
    background-color: #45a049;
  }
  
  .container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
  }
  
  .col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
  }
  
  .col-75 {
    float: left;
    width: 75%;
    margin-top: 6px;
  }
  
  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }

 
  
  #map {
    height: 50vh;
    margin-bottom: 10px;
    display: none;
  }
  
  #locationList .card {
    padding: 10px;
  }
  
  #toast-container {
    top: 50%;
    bottom: unset;
  }
  
  .toast {
    background-color: rgba(0, 0, 0, 0.8);
  }
  
  @media only screen and (max-width: 768px) {
    .container {
      width: 80%;
    }
  }
  
  /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
  @media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
      width: 100%;
      margin-top: 0;
    }
  }
