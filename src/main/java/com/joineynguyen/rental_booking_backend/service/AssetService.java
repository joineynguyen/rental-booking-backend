package com.joineynguyen.rental_booking_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joineynguyen.rental_booking_backend.model.Asset;
import com.joineynguyen.rental_booking_backend.repository.AssetRepository;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset getAssetById(Long assetId) {
        return assetRepository.getReferenceById(assetId);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public List<Asset> getAssetsByOwnerId(Long ownerId) {
        return assetRepository.findByOwnerId(ownerId);
    }

    public void deleteAsset(Long assetId) {
        assetRepository.deleteById(assetId);
    }

}
