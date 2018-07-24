package com.kgisl.docket.controller;

import com.kgisl.docket.model.Portfolio;

/**
 * PortfolioBuilder
 */
public class PortfolioBuilder {

    private Portfolio portfolio = new Portfolio();

    public PortfolioBuilder id(Long id) {
        portfolio.setId(id);
        return this;
    }

    public PortfolioBuilder cat(String cat) {
        portfolio.setCat(cat);
        return this;
    }

    public PortfolioBuilder symbol(String symbol) {
        portfolio.setSymbol(symbol);
        return this;
    }

    public Portfolio build() {
        return portfolio;
    }
}