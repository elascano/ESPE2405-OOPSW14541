const chai = require('chai');
const chaiHttp = require('chai-http');
const server = require('../server');
const TaxPayer = require('c:/Users/andre/OneDrive/Desktop/proyectos JS/HW21/backend/models/Taxpayer');

chai.should();
chai.use(chaiHttp);

describe('TaxPayers API', () => {
    // Antes de cada prueba, podemos limpiar la base de datos o inicializar algunos datos de prueba
    beforeEach((done) => {
        TaxPayer.deleteMany({}, (err) => {
            done();
        });
    });

    /**
     * Test the GET route /api/taxPayers/search/:ninthDigit
     */
    describe('GET /api/taxPayers/search/:ninthDigit', () => {
        it('it should GET all the taxpayers with the specified ninth digit', (done) => {
            const taxpayer1 = new TaxPayer({ id: '1234567890123', email: 'test1@example.com', name: 'Test One', password: 'pass1', documentation: 'docs1' });
            const taxpayer2 = new TaxPayer({ id: '1234567890129', email: 'test2@example.com', name: 'Test Two', password: 'pass2', documentation: 'docs2' });

            taxpayer1.save();
            taxpayer2.save();

            chai.request(server)
                .get('/api/taxPayers/search/9')
                .end((err, res) => {
                    res.should.have.status(200);
                    res.body.should.be.a('array');
                    res.body.length.should.be.eql(1);
                    res.body[0].should.have.property('id').eql('1234567890129');
                    done();
                });
        });

        it('it should return an empty array if no taxpayers match the specified ninth digit', (done) => {
            const taxpayer1 = new TaxPayer({ id: '1234567890123', email: 'test1@example.com', name: 'Test One', password: 'pass1', documentation: 'docs1' });

            taxpayer1.save();

            chai.request(server)
                .get('/api/taxPayers/search/9')
                .end((err, res) => {
                    res.should.have.status(200);
                    res.body.should.be.a('array');
                    res.body.length.should.be.eql(0);
                    done();
                });
        });
    });
});
