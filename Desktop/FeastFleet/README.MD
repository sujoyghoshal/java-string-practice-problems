# FeastFleet - Online Food Ordering and Delivery System

## Introduction
FeastFleet is a full-fledged online food ordering and delivery platform that enables customers to browse restaurants, order food, and track deliveries in real time. The platform is designed to be scalable, secure, and user-friendly, catering to both small businesses and large restaurant chains.

## Features
- **User Authentication**: Secure login/signup for customers, restaurants, and delivery agents.
- **Restaurant Management**: Restaurants can list their menus, update prices, and manage orders.
- **Food Ordering System**: Customers can browse restaurants, add items to the cart, and place orders.
- **Real-Time Order Tracking**: Live updates on order preparation and delivery status.
- **Payment Integration**: Supports multiple payment gateways (PayPal, Stripe, Razorpay, etc.).
- **Admin Dashboard**: Provides insights, analytics, and management tools for restaurant owners and administrators.

## Technologies Used
- **Backend**: Python (Django/FastAPI)
- **Frontend**: React.js / Next.js
- **Database**: PostgreSQL / MongoDB
- **Authentication**: JWT-based authentication
- **Deployment**: Docker, AWS/GCP

## Installation & Setup

### Prerequisites
- Python 3.9+
- Node.js & npm
- PostgreSQL / MongoDB
- Virtual environment (optional but recommended)

### Backend Setup
```bash
# Clone the repository
git clone https://github.com/sujoyghoshal/feastfleet.git
cd feastfleet/backend

# Create virtual environment
python -m venv env
source env/bin/activate  # For Linux/macOS
env\Scripts\activate  # For Windows

# Install dependencies
pip install -r requirements.txt

# Apply migrations
python manage.py migrate

# Run the server
python manage.py runserver
```

### Frontend Setup
```bash
cd feastfleet/frontend

# Install dependencies
npm install

# Run the development server
npm run dev
```

## Usage
1. **User Registration/Login**: Customers, restaurants, and delivery agents can sign up and log in.
2. **Browse Restaurants**: Customers can explore various restaurants and their menus.
3. **Place Order**: Users can add items to the cart and checkout with secure payment options.
4. **Track Order**: Live tracking system for monitoring order status and delivery progress.

## Contribution
If you wish to contribute, please fork the repository and create a pull request with your improvements.

## License
This project is licensed under the MIT License.

---
**Contributors:** Sujoy Ghoshal, Sumit Mula
