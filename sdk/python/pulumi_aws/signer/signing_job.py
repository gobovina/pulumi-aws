# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SigningJobArgs', 'SigningJob']

@pulumi.input_type
class SigningJobArgs:
    def __init__(__self__, *,
                 destination: pulumi.Input['SigningJobDestinationArgs'],
                 profile_name: pulumi.Input[str],
                 source: pulumi.Input['SigningJobSourceArgs'],
                 ignore_signing_job_failure: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SigningJob resource.
        :param pulumi.Input['SigningJobDestinationArgs'] destination: The S3 bucket in which to save your signed object. See Destination below for details.
        :param pulumi.Input[str] profile_name: The name of the profile to initiate the signing operation.
        :param pulumi.Input['SigningJobSourceArgs'] source: The S3 bucket that contains the object to sign. See Source below for details.
        :param pulumi.Input[bool] ignore_signing_job_failure: Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        """
        pulumi.set(__self__, "destination", destination)
        pulumi.set(__self__, "profile_name", profile_name)
        pulumi.set(__self__, "source", source)
        if ignore_signing_job_failure is not None:
            pulumi.set(__self__, "ignore_signing_job_failure", ignore_signing_job_failure)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Input['SigningJobDestinationArgs']:
        """
        The S3 bucket in which to save your signed object. See Destination below for details.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: pulumi.Input['SigningJobDestinationArgs']):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> pulumi.Input[str]:
        """
        The name of the profile to initiate the signing operation.
        """
        return pulumi.get(self, "profile_name")

    @profile_name.setter
    def profile_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "profile_name", value)

    @property
    @pulumi.getter
    def source(self) -> pulumi.Input['SigningJobSourceArgs']:
        """
        The S3 bucket that contains the object to sign. See Source below for details.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: pulumi.Input['SigningJobSourceArgs']):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="ignoreSigningJobFailure")
    def ignore_signing_job_failure(self) -> Optional[pulumi.Input[bool]]:
        """
        Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        """
        return pulumi.get(self, "ignore_signing_job_failure")

    @ignore_signing_job_failure.setter
    def ignore_signing_job_failure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_signing_job_failure", value)


@pulumi.input_type
class _SigningJobState:
    def __init__(__self__, *,
                 completed_at: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 destination: Optional[pulumi.Input['SigningJobDestinationArgs']] = None,
                 ignore_signing_job_failure: Optional[pulumi.Input[bool]] = None,
                 job_id: Optional[pulumi.Input[str]] = None,
                 job_invoker: Optional[pulumi.Input[str]] = None,
                 job_owner: Optional[pulumi.Input[str]] = None,
                 platform_display_name: Optional[pulumi.Input[str]] = None,
                 platform_id: Optional[pulumi.Input[str]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 profile_version: Optional[pulumi.Input[str]] = None,
                 requested_by: Optional[pulumi.Input[str]] = None,
                 revocation_records: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobRevocationRecordArgs']]]] = None,
                 signature_expires_at: Optional[pulumi.Input[str]] = None,
                 signed_objects: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectArgs']]]] = None,
                 source: Optional[pulumi.Input['SigningJobSourceArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 status_reason: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SigningJob resources.
        :param pulumi.Input[str] completed_at: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
        :param pulumi.Input[str] created_at: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
        :param pulumi.Input['SigningJobDestinationArgs'] destination: The S3 bucket in which to save your signed object. See Destination below for details.
        :param pulumi.Input[bool] ignore_signing_job_failure: Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        :param pulumi.Input[str] job_id: The ID of the signing job on output.
        :param pulumi.Input[str] job_invoker: The IAM entity that initiated the signing job.
        :param pulumi.Input[str] job_owner: The AWS account ID of the job owner.
        :param pulumi.Input[str] platform_display_name: A human-readable name for the signing platform associated with the signing job.
        :param pulumi.Input[str] platform_id: The platform to which your signed code image will be distributed.
        :param pulumi.Input[str] profile_name: The name of the profile to initiate the signing operation.
        :param pulumi.Input[str] profile_version: The version of the signing profile used to initiate the signing job.
        :param pulumi.Input[str] requested_by: The IAM principal that requested the signing job.
        :param pulumi.Input[Sequence[pulumi.Input['SigningJobRevocationRecordArgs']]] revocation_records: A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
        :param pulumi.Input[str] signature_expires_at: The time when the signature of a signing job expires.
        :param pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectArgs']]] signed_objects: Name of the S3 bucket where the signed code image is saved by code signing.
        :param pulumi.Input['SigningJobSourceArgs'] source: The S3 bucket that contains the object to sign. See Source below for details.
        :param pulumi.Input[str] status: Status of the signing job.
        :param pulumi.Input[str] status_reason: String value that contains the status reason.
        """
        if completed_at is not None:
            pulumi.set(__self__, "completed_at", completed_at)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if destination is not None:
            pulumi.set(__self__, "destination", destination)
        if ignore_signing_job_failure is not None:
            pulumi.set(__self__, "ignore_signing_job_failure", ignore_signing_job_failure)
        if job_id is not None:
            pulumi.set(__self__, "job_id", job_id)
        if job_invoker is not None:
            pulumi.set(__self__, "job_invoker", job_invoker)
        if job_owner is not None:
            pulumi.set(__self__, "job_owner", job_owner)
        if platform_display_name is not None:
            pulumi.set(__self__, "platform_display_name", platform_display_name)
        if platform_id is not None:
            pulumi.set(__self__, "platform_id", platform_id)
        if profile_name is not None:
            pulumi.set(__self__, "profile_name", profile_name)
        if profile_version is not None:
            pulumi.set(__self__, "profile_version", profile_version)
        if requested_by is not None:
            pulumi.set(__self__, "requested_by", requested_by)
        if revocation_records is not None:
            pulumi.set(__self__, "revocation_records", revocation_records)
        if signature_expires_at is not None:
            pulumi.set(__self__, "signature_expires_at", signature_expires_at)
        if signed_objects is not None:
            pulumi.set(__self__, "signed_objects", signed_objects)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_reason is not None:
            pulumi.set(__self__, "status_reason", status_reason)

    @property
    @pulumi.getter(name="completedAt")
    def completed_at(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
        """
        return pulumi.get(self, "completed_at")

    @completed_at.setter
    def completed_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "completed_at", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def destination(self) -> Optional[pulumi.Input['SigningJobDestinationArgs']]:
        """
        The S3 bucket in which to save your signed object. See Destination below for details.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: Optional[pulumi.Input['SigningJobDestinationArgs']]):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter(name="ignoreSigningJobFailure")
    def ignore_signing_job_failure(self) -> Optional[pulumi.Input[bool]]:
        """
        Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        """
        return pulumi.get(self, "ignore_signing_job_failure")

    @ignore_signing_job_failure.setter
    def ignore_signing_job_failure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_signing_job_failure", value)

    @property
    @pulumi.getter(name="jobId")
    def job_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the signing job on output.
        """
        return pulumi.get(self, "job_id")

    @job_id.setter
    def job_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "job_id", value)

    @property
    @pulumi.getter(name="jobInvoker")
    def job_invoker(self) -> Optional[pulumi.Input[str]]:
        """
        The IAM entity that initiated the signing job.
        """
        return pulumi.get(self, "job_invoker")

    @job_invoker.setter
    def job_invoker(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "job_invoker", value)

    @property
    @pulumi.getter(name="jobOwner")
    def job_owner(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID of the job owner.
        """
        return pulumi.get(self, "job_owner")

    @job_owner.setter
    def job_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "job_owner", value)

    @property
    @pulumi.getter(name="platformDisplayName")
    def platform_display_name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable name for the signing platform associated with the signing job.
        """
        return pulumi.get(self, "platform_display_name")

    @platform_display_name.setter
    def platform_display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "platform_display_name", value)

    @property
    @pulumi.getter(name="platformId")
    def platform_id(self) -> Optional[pulumi.Input[str]]:
        """
        The platform to which your signed code image will be distributed.
        """
        return pulumi.get(self, "platform_id")

    @platform_id.setter
    def platform_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "platform_id", value)

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the profile to initiate the signing operation.
        """
        return pulumi.get(self, "profile_name")

    @profile_name.setter
    def profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_name", value)

    @property
    @pulumi.getter(name="profileVersion")
    def profile_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the signing profile used to initiate the signing job.
        """
        return pulumi.get(self, "profile_version")

    @profile_version.setter
    def profile_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_version", value)

    @property
    @pulumi.getter(name="requestedBy")
    def requested_by(self) -> Optional[pulumi.Input[str]]:
        """
        The IAM principal that requested the signing job.
        """
        return pulumi.get(self, "requested_by")

    @requested_by.setter
    def requested_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "requested_by", value)

    @property
    @pulumi.getter(name="revocationRecords")
    def revocation_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobRevocationRecordArgs']]]]:
        """
        A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
        """
        return pulumi.get(self, "revocation_records")

    @revocation_records.setter
    def revocation_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobRevocationRecordArgs']]]]):
        pulumi.set(self, "revocation_records", value)

    @property
    @pulumi.getter(name="signatureExpiresAt")
    def signature_expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the signature of a signing job expires.
        """
        return pulumi.get(self, "signature_expires_at")

    @signature_expires_at.setter
    def signature_expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signature_expires_at", value)

    @property
    @pulumi.getter(name="signedObjects")
    def signed_objects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectArgs']]]]:
        """
        Name of the S3 bucket where the signed code image is saved by code signing.
        """
        return pulumi.get(self, "signed_objects")

    @signed_objects.setter
    def signed_objects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SigningJobSignedObjectArgs']]]]):
        pulumi.set(self, "signed_objects", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['SigningJobSourceArgs']]:
        """
        The S3 bucket that contains the object to sign. See Source below for details.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['SigningJobSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the signing job.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="statusReason")
    def status_reason(self) -> Optional[pulumi.Input[str]]:
        """
        String value that contains the status reason.
        """
        return pulumi.get(self, "status_reason")

    @status_reason.setter
    def status_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status_reason", value)


class SigningJob(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[pulumi.InputType['SigningJobDestinationArgs']]] = None,
                 ignore_signing_job_failure: Optional[pulumi.Input[bool]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['SigningJobSourceArgs']]] = None,
                 __props__=None):
        """
        Creates a Signer Signing Job.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_sp = aws.signer.SigningProfile("testSp", platform_id="AWSLambda-SHA384-ECDSA")
        build_signing_job = aws.signer.SigningJob("buildSigningJob",
            profile_name=test_sp.name,
            source=aws.signer.SigningJobSourceArgs(
                s3=aws.signer.SigningJobSourceS3Args(
                    bucket="s3-bucket-name",
                    key="object-to-be-signed.zip",
                    version="jADjFYYYEXAMPLETszPjOmCMFDzd9dN1",
                ),
            ),
            destination=aws.signer.SigningJobDestinationArgs(
                s3=aws.signer.SigningJobDestinationS3Args(
                    bucket="s3-bucket-name",
                    prefix="signed/",
                ),
            ),
            ignore_signing_job_failure=True)
        ```

        ## Import

        Using `pulumi import`, import Signer signing jobs using the `job_id`. For example:

        ```sh
         $ pulumi import aws:signer/signingJob:SigningJob test_signer_signing_job 9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SigningJobDestinationArgs']] destination: The S3 bucket in which to save your signed object. See Destination below for details.
        :param pulumi.Input[bool] ignore_signing_job_failure: Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        :param pulumi.Input[str] profile_name: The name of the profile to initiate the signing operation.
        :param pulumi.Input[pulumi.InputType['SigningJobSourceArgs']] source: The S3 bucket that contains the object to sign. See Source below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SigningJobArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Signer Signing Job.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_sp = aws.signer.SigningProfile("testSp", platform_id="AWSLambda-SHA384-ECDSA")
        build_signing_job = aws.signer.SigningJob("buildSigningJob",
            profile_name=test_sp.name,
            source=aws.signer.SigningJobSourceArgs(
                s3=aws.signer.SigningJobSourceS3Args(
                    bucket="s3-bucket-name",
                    key="object-to-be-signed.zip",
                    version="jADjFYYYEXAMPLETszPjOmCMFDzd9dN1",
                ),
            ),
            destination=aws.signer.SigningJobDestinationArgs(
                s3=aws.signer.SigningJobDestinationS3Args(
                    bucket="s3-bucket-name",
                    prefix="signed/",
                ),
            ),
            ignore_signing_job_failure=True)
        ```

        ## Import

        Using `pulumi import`, import Signer signing jobs using the `job_id`. For example:

        ```sh
         $ pulumi import aws:signer/signingJob:SigningJob test_signer_signing_job 9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee
        ```

        :param str resource_name: The name of the resource.
        :param SigningJobArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SigningJobArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[pulumi.InputType['SigningJobDestinationArgs']]] = None,
                 ignore_signing_job_failure: Optional[pulumi.Input[bool]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['SigningJobSourceArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SigningJobArgs.__new__(SigningJobArgs)

            if destination is None and not opts.urn:
                raise TypeError("Missing required property 'destination'")
            __props__.__dict__["destination"] = destination
            __props__.__dict__["ignore_signing_job_failure"] = ignore_signing_job_failure
            if profile_name is None and not opts.urn:
                raise TypeError("Missing required property 'profile_name'")
            __props__.__dict__["profile_name"] = profile_name
            if source is None and not opts.urn:
                raise TypeError("Missing required property 'source'")
            __props__.__dict__["source"] = source
            __props__.__dict__["completed_at"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["job_id"] = None
            __props__.__dict__["job_invoker"] = None
            __props__.__dict__["job_owner"] = None
            __props__.__dict__["platform_display_name"] = None
            __props__.__dict__["platform_id"] = None
            __props__.__dict__["profile_version"] = None
            __props__.__dict__["requested_by"] = None
            __props__.__dict__["revocation_records"] = None
            __props__.__dict__["signature_expires_at"] = None
            __props__.__dict__["signed_objects"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["status_reason"] = None
        super(SigningJob, __self__).__init__(
            'aws:signer/signingJob:SigningJob',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            completed_at: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            destination: Optional[pulumi.Input[pulumi.InputType['SigningJobDestinationArgs']]] = None,
            ignore_signing_job_failure: Optional[pulumi.Input[bool]] = None,
            job_id: Optional[pulumi.Input[str]] = None,
            job_invoker: Optional[pulumi.Input[str]] = None,
            job_owner: Optional[pulumi.Input[str]] = None,
            platform_display_name: Optional[pulumi.Input[str]] = None,
            platform_id: Optional[pulumi.Input[str]] = None,
            profile_name: Optional[pulumi.Input[str]] = None,
            profile_version: Optional[pulumi.Input[str]] = None,
            requested_by: Optional[pulumi.Input[str]] = None,
            revocation_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SigningJobRevocationRecordArgs']]]]] = None,
            signature_expires_at: Optional[pulumi.Input[str]] = None,
            signed_objects: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SigningJobSignedObjectArgs']]]]] = None,
            source: Optional[pulumi.Input[pulumi.InputType['SigningJobSourceArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_reason: Optional[pulumi.Input[str]] = None) -> 'SigningJob':
        """
        Get an existing SigningJob resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] completed_at: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
        :param pulumi.Input[str] created_at: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
        :param pulumi.Input[pulumi.InputType['SigningJobDestinationArgs']] destination: The S3 bucket in which to save your signed object. See Destination below for details.
        :param pulumi.Input[bool] ignore_signing_job_failure: Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        :param pulumi.Input[str] job_id: The ID of the signing job on output.
        :param pulumi.Input[str] job_invoker: The IAM entity that initiated the signing job.
        :param pulumi.Input[str] job_owner: The AWS account ID of the job owner.
        :param pulumi.Input[str] platform_display_name: A human-readable name for the signing platform associated with the signing job.
        :param pulumi.Input[str] platform_id: The platform to which your signed code image will be distributed.
        :param pulumi.Input[str] profile_name: The name of the profile to initiate the signing operation.
        :param pulumi.Input[str] profile_version: The version of the signing profile used to initiate the signing job.
        :param pulumi.Input[str] requested_by: The IAM principal that requested the signing job.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SigningJobRevocationRecordArgs']]]] revocation_records: A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
        :param pulumi.Input[str] signature_expires_at: The time when the signature of a signing job expires.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SigningJobSignedObjectArgs']]]] signed_objects: Name of the S3 bucket where the signed code image is saved by code signing.
        :param pulumi.Input[pulumi.InputType['SigningJobSourceArgs']] source: The S3 bucket that contains the object to sign. See Source below for details.
        :param pulumi.Input[str] status: Status of the signing job.
        :param pulumi.Input[str] status_reason: String value that contains the status reason.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SigningJobState.__new__(_SigningJobState)

        __props__.__dict__["completed_at"] = completed_at
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["destination"] = destination
        __props__.__dict__["ignore_signing_job_failure"] = ignore_signing_job_failure
        __props__.__dict__["job_id"] = job_id
        __props__.__dict__["job_invoker"] = job_invoker
        __props__.__dict__["job_owner"] = job_owner
        __props__.__dict__["platform_display_name"] = platform_display_name
        __props__.__dict__["platform_id"] = platform_id
        __props__.__dict__["profile_name"] = profile_name
        __props__.__dict__["profile_version"] = profile_version
        __props__.__dict__["requested_by"] = requested_by
        __props__.__dict__["revocation_records"] = revocation_records
        __props__.__dict__["signature_expires_at"] = signature_expires_at
        __props__.__dict__["signed_objects"] = signed_objects
        __props__.__dict__["source"] = source
        __props__.__dict__["status"] = status
        __props__.__dict__["status_reason"] = status_reason
        return SigningJob(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="completedAt")
    def completed_at(self) -> pulumi.Output[str]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
        """
        return pulumi.get(self, "completed_at")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Output['outputs.SigningJobDestination']:
        """
        The S3 bucket in which to save your signed object. See Destination below for details.
        """
        return pulumi.get(self, "destination")

    @property
    @pulumi.getter(name="ignoreSigningJobFailure")
    def ignore_signing_job_failure(self) -> pulumi.Output[Optional[bool]]:
        """
        Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
        """
        return pulumi.get(self, "ignore_signing_job_failure")

    @property
    @pulumi.getter(name="jobId")
    def job_id(self) -> pulumi.Output[str]:
        """
        The ID of the signing job on output.
        """
        return pulumi.get(self, "job_id")

    @property
    @pulumi.getter(name="jobInvoker")
    def job_invoker(self) -> pulumi.Output[str]:
        """
        The IAM entity that initiated the signing job.
        """
        return pulumi.get(self, "job_invoker")

    @property
    @pulumi.getter(name="jobOwner")
    def job_owner(self) -> pulumi.Output[str]:
        """
        The AWS account ID of the job owner.
        """
        return pulumi.get(self, "job_owner")

    @property
    @pulumi.getter(name="platformDisplayName")
    def platform_display_name(self) -> pulumi.Output[str]:
        """
        A human-readable name for the signing platform associated with the signing job.
        """
        return pulumi.get(self, "platform_display_name")

    @property
    @pulumi.getter(name="platformId")
    def platform_id(self) -> pulumi.Output[str]:
        """
        The platform to which your signed code image will be distributed.
        """
        return pulumi.get(self, "platform_id")

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> pulumi.Output[str]:
        """
        The name of the profile to initiate the signing operation.
        """
        return pulumi.get(self, "profile_name")

    @property
    @pulumi.getter(name="profileVersion")
    def profile_version(self) -> pulumi.Output[str]:
        """
        The version of the signing profile used to initiate the signing job.
        """
        return pulumi.get(self, "profile_version")

    @property
    @pulumi.getter(name="requestedBy")
    def requested_by(self) -> pulumi.Output[str]:
        """
        The IAM principal that requested the signing job.
        """
        return pulumi.get(self, "requested_by")

    @property
    @pulumi.getter(name="revocationRecords")
    def revocation_records(self) -> pulumi.Output[Sequence['outputs.SigningJobRevocationRecord']]:
        """
        A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
        """
        return pulumi.get(self, "revocation_records")

    @property
    @pulumi.getter(name="signatureExpiresAt")
    def signature_expires_at(self) -> pulumi.Output[str]:
        """
        The time when the signature of a signing job expires.
        """
        return pulumi.get(self, "signature_expires_at")

    @property
    @pulumi.getter(name="signedObjects")
    def signed_objects(self) -> pulumi.Output[Sequence['outputs.SigningJobSignedObject']]:
        """
        Name of the S3 bucket where the signed code image is saved by code signing.
        """
        return pulumi.get(self, "signed_objects")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output['outputs.SigningJobSource']:
        """
        The S3 bucket that contains the object to sign. See Source below for details.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the signing job.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusReason")
    def status_reason(self) -> pulumi.Output[str]:
        """
        String value that contains the status reason.
        """
        return pulumi.get(self, "status_reason")

