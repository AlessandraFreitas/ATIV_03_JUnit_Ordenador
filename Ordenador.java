/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author alefr
 */
public class Ordenador {
    
    double pUm = 3;
	double pDois = 4;
	double pTres = 5;
	double pQuatro = 6;

	public double informarValor(String pValor) {
		double pX = Double.parseDouble(pValor);

		if (pUm > pDois && pUm > pTres) {
			if (pX > pUm) {
				pUm = pX;
				return pUm;
			}
		} else if (pDois > pUm && pDois > pTres) {
			if (pX > pDois) {
				pDois = pX;
				return pDois;
			}
		} else if (pTres > pDois && pTres > pUm) {
			if (pX > pTres) {
				pTres = pX;
				return pTres;
			}
		}
		return 1;
	}

	public double getMaiorValor() {
		if (pUm > pDois && pUm > pTres) {
			return 3;
		} else if (pDois > pUm && pDois > pTres) {
			return 4;
		} else if (pTres > pDois && pTres > pUm) {
			return 5;
		}
		return 1;
	}

	public double getMenorValor() {
		if (pUm < pDois && pUm < pTres) {
			return 3;
		} else if (pDois < pUm && pDois < pTres) {
			return 4;
		} else if (pTres < pDois && pTres < pUm) {
			return 5;
		}
		return 2;
	}

	public double getValorMedio() {
		double soma = pUm + pDois + pTres;
		double media = soma / 3;

		return media;
	}

	public double getValorMediana() {

		if (pUm > pDois && pUm < pTres && pUm < pQuatro) {
			if (pUm % 2 == 0) {
				if (pDois % 2 == 0) {
					double Soma = pUm + pDois;
					return Soma / 2;
				}
			}
			return pDois;
		} else if (pTres > pQuatro && pTres < pDois && pTres < pUm) {
			if (pTres % 2 == 0) {
				if (pQuatro % 2 == 0) {
					double Soma = pTres + pQuatro;
					return Soma / 2;
				}
			}
			return pQuatro;
		} else if (pUm > pTres && pUm < pDois && pUm < pQuatro) {
			if (pUm % 2 == 0) {
				if (pTres % 2 == 0) {
					double Soma = pUm + pTres;
					return Soma / 2;
				}
			}
			return pTres;
		} else if (pUm > pQuatro && pUm < pDois && pUm < pTres) {
			if (pUm % 2 == 0) {
				if (pQuatro % 2 == 0) {
					double Soma = pUm + pQuatro;
					return Soma / 2;
				}
			}
			return pQuatro;
		} else if (pDois > pTres && pDois < pDois && pDois < pQuatro) {
			if (pDois % 2 == 0) {
				if (pTres % 2 == 0) {
					double Soma = pDois + pTres;
					return Soma / 2;
				}
			}
			return pTres;
		} else if (pQuatro > pTres && pQuatro < pDois && pQuatro < pUm) {
			if (pTres % 2 == 0) {
				if (pQuatro % 2 == 0) {
					double Soma = pQuatro + pTres;
					return Soma / 2;
				}
			}
			return pTres;
		} else if (pDois > pUm && pDois < pTres && pDois < pQuatro) {
			if (pDois % 2 == 0) {
				if (pUm % 2 == 0) {

					double Soma = pDois + pUm;
					return Soma / 2;
				}
			}
			return pUm;
		}
		return 1;
	}
    
}
