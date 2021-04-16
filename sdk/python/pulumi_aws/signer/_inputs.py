# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'SigningJobDestinationArgs',
    'SigningJobDestinationS3Args',
    'SigningJobRevocationRecordArgs',
    'SigningJobSignedObjectArgs',
    'SigningJobSignedObjectS3Args',
    'SigningJobSourceArgs',
    'SigningJobSourceS3Args',
    'SigningProfileRevocationRecordArgs',
    'SigningProfileSignatureValidityPeriodArgs',
]

@pulumi.input_type
class SigningJobDestinationArgs:
    def __init__(__self__, *,
                 s3: pulumi.Input['SigningJobDestinationS3Args']):
        """
        :param pulumi.Input['SigningJobDestinationS3Args'] s3: A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        pulumi.set(__self__, "s3", s3)

    @property
    @pulumi.getter
    def s3(self) -> pulumi.Input['SigningJobDestinationS3Args']:
        """
        A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        return pulumi.get(self, "s3")

    @s3.setter
    def s3(self, value: pulumi.Input['SigningJobDestinationS3Args']):
        pulumi.set(self, "s3", value)


@pulumi.input_type
class SigningJobDestinationS3Args:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 prefix: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] bucket: Name of the S3 bucket.
        :param pulumi.Input[str] prefix: An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
        """
        pulumi.set(__self__, "bucket", bucket)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        Name of the S3 bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)


@pulumi.input_type
class SigningJobRevocationRecordArgs:
    def __init__(__self__, *,
                 reason: Optional[pulumi.Input[str]] = None,
                 revoked_at: Optional[pulumi.Input[str]] = None,
                 revoked_by: Optional[pulumi.Input[str]] = None):
        if reason is not None:
            pulumi.set(__self__, "reason", reason)
        if revoked_at is not None:
            pulumi.set(__self__, "revoked_at", revoked_at)
        if revoked_by is not None:
            pulumi.set(__self__, "revoked_by", revoked_by)

    @property
    @pulumi.getter
    def reason(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "reason")

    @reason.setter
    def reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reason", value)

    @property
    @pulumi.getter(name="revokedAt")
    def revoked_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "revoked_at")

    @revoked_at.setter
    def revoked_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revoked_at", value)

    @property
    @pulumi.getter(name="revokedBy")
    def revoked_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "revoked_by")

    @revoked_by.setter
    def revoked_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revoked_by", value)


@pulumi.input_type
class SigningJobSignedObjectArgs:
    def __init__(__self__, *,
                 s3s: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectS3Args']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectS3Args']]] s3s: A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        if s3s is not None:
            pulumi.set(__self__, "s3s", s3s)

    @property
    @pulumi.getter
    def s3s(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectS3Args']]]]:
        """
        A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        return pulumi.get(self, "s3s")

    @s3s.setter
    def s3s(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectS3Args']]]]):
        pulumi.set(self, "s3s", value)


@pulumi.input_type
class SigningJobSignedObjectS3Args:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] bucket: Name of the S3 bucket.
        :param pulumi.Input[str] key: Key name of the bucket object that contains your unsigned code.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if key is not None:
            pulumi.set(__self__, "key", key)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the S3 bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        Key name of the bucket object that contains your unsigned code.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)


@pulumi.input_type
class SigningJobSourceArgs:
    def __init__(__self__, *,
                 s3: pulumi.Input['SigningJobSourceS3Args']):
        """
        :param pulumi.Input['SigningJobSourceS3Args'] s3: A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        pulumi.set(__self__, "s3", s3)

    @property
    @pulumi.getter
    def s3(self) -> pulumi.Input['SigningJobSourceS3Args']:
        """
        A configuration block describing the S3 Destination object: See S3 Destination below for details.
        """
        return pulumi.get(self, "s3")

    @s3.setter
    def s3(self, value: pulumi.Input['SigningJobSourceS3Args']):
        pulumi.set(self, "s3", value)


@pulumi.input_type
class SigningJobSourceS3Args:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 key: pulumi.Input[str],
                 version: pulumi.Input[str]):
        """
        :param pulumi.Input[str] bucket: Name of the S3 bucket.
        :param pulumi.Input[str] key: Key name of the bucket object that contains your unsigned code.
        :param pulumi.Input[str] version: Version of your source image in your version enabled S3 bucket.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        Name of the S3 bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Key name of the bucket object that contains your unsigned code.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        Version of your source image in your version enabled S3 bucket.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class SigningProfileRevocationRecordArgs:
    def __init__(__self__, *,
                 revocation_effective_from: Optional[pulumi.Input[str]] = None,
                 revoked_at: Optional[pulumi.Input[str]] = None,
                 revoked_by: Optional[pulumi.Input[str]] = None):
        if revocation_effective_from is not None:
            pulumi.set(__self__, "revocation_effective_from", revocation_effective_from)
        if revoked_at is not None:
            pulumi.set(__self__, "revoked_at", revoked_at)
        if revoked_by is not None:
            pulumi.set(__self__, "revoked_by", revoked_by)

    @property
    @pulumi.getter(name="revocationEffectiveFrom")
    def revocation_effective_from(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "revocation_effective_from")

    @revocation_effective_from.setter
    def revocation_effective_from(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revocation_effective_from", value)

    @property
    @pulumi.getter(name="revokedAt")
    def revoked_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "revoked_at")

    @revoked_at.setter
    def revoked_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revoked_at", value)

    @property
    @pulumi.getter(name="revokedBy")
    def revoked_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "revoked_by")

    @revoked_by.setter
    def revoked_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revoked_by", value)


@pulumi.input_type
class SigningProfileSignatureValidityPeriodArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 value: pulumi.Input[int]):
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[int]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[int]):
        pulumi.set(self, "value", value)


