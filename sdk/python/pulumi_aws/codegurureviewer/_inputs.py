# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'RepositoryAssociationKmsKeyDetailsArgs',
    'RepositoryAssociationKmsKeyDetailsArgsDict',
    'RepositoryAssociationRepositoryArgs',
    'RepositoryAssociationRepositoryArgsDict',
    'RepositoryAssociationRepositoryBitbucketArgs',
    'RepositoryAssociationRepositoryBitbucketArgsDict',
    'RepositoryAssociationRepositoryCodecommitArgs',
    'RepositoryAssociationRepositoryCodecommitArgsDict',
    'RepositoryAssociationRepositoryGithubEnterpriseServerArgs',
    'RepositoryAssociationRepositoryGithubEnterpriseServerArgsDict',
    'RepositoryAssociationRepositoryS3BucketArgs',
    'RepositoryAssociationRepositoryS3BucketArgsDict',
    'RepositoryAssociationS3RepositoryDetailArgs',
    'RepositoryAssociationS3RepositoryDetailArgsDict',
    'RepositoryAssociationS3RepositoryDetailCodeArtifactArgs',
    'RepositoryAssociationS3RepositoryDetailCodeArtifactArgsDict',
]

MYPY = False

if not MYPY:
    class RepositoryAssociationKmsKeyDetailsArgsDict(TypedDict):
        encryption_option: NotRequired[pulumi.Input[str]]
        """
        The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (`AWS_OWNED_CMK`) or customer managed (`CUSTOMER_MANAGED_CMK`).
        """
        kms_key_id: NotRequired[pulumi.Input[str]]
        """
        The ID of the AWS KMS key that is associated with a repository association.
        """
elif False:
    RepositoryAssociationKmsKeyDetailsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationKmsKeyDetailsArgs:
    def __init__(__self__, *,
                 encryption_option: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] encryption_option: The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (`AWS_OWNED_CMK`) or customer managed (`CUSTOMER_MANAGED_CMK`).
        :param pulumi.Input[str] kms_key_id: The ID of the AWS KMS key that is associated with a repository association.
        """
        if encryption_option is not None:
            pulumi.set(__self__, "encryption_option", encryption_option)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)

    @property
    @pulumi.getter(name="encryptionOption")
    def encryption_option(self) -> Optional[pulumi.Input[str]]:
        """
        The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (`AWS_OWNED_CMK`) or customer managed (`CUSTOMER_MANAGED_CMK`).
        """
        return pulumi.get(self, "encryption_option")

    @encryption_option.setter
    def encryption_option(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encryption_option", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS KMS key that is associated with a repository association.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)


if not MYPY:
    class RepositoryAssociationRepositoryArgsDict(TypedDict):
        bitbucket: NotRequired[pulumi.Input['RepositoryAssociationRepositoryBitbucketArgsDict']]
        codecommit: NotRequired[pulumi.Input['RepositoryAssociationRepositoryCodecommitArgsDict']]
        github_enterprise_server: NotRequired[pulumi.Input['RepositoryAssociationRepositoryGithubEnterpriseServerArgsDict']]
        s3_bucket: NotRequired[pulumi.Input['RepositoryAssociationRepositoryS3BucketArgsDict']]
elif False:
    RepositoryAssociationRepositoryArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationRepositoryArgs:
    def __init__(__self__, *,
                 bitbucket: Optional[pulumi.Input['RepositoryAssociationRepositoryBitbucketArgs']] = None,
                 codecommit: Optional[pulumi.Input['RepositoryAssociationRepositoryCodecommitArgs']] = None,
                 github_enterprise_server: Optional[pulumi.Input['RepositoryAssociationRepositoryGithubEnterpriseServerArgs']] = None,
                 s3_bucket: Optional[pulumi.Input['RepositoryAssociationRepositoryS3BucketArgs']] = None):
        if bitbucket is not None:
            pulumi.set(__self__, "bitbucket", bitbucket)
        if codecommit is not None:
            pulumi.set(__self__, "codecommit", codecommit)
        if github_enterprise_server is not None:
            pulumi.set(__self__, "github_enterprise_server", github_enterprise_server)
        if s3_bucket is not None:
            pulumi.set(__self__, "s3_bucket", s3_bucket)

    @property
    @pulumi.getter
    def bitbucket(self) -> Optional[pulumi.Input['RepositoryAssociationRepositoryBitbucketArgs']]:
        return pulumi.get(self, "bitbucket")

    @bitbucket.setter
    def bitbucket(self, value: Optional[pulumi.Input['RepositoryAssociationRepositoryBitbucketArgs']]):
        pulumi.set(self, "bitbucket", value)

    @property
    @pulumi.getter
    def codecommit(self) -> Optional[pulumi.Input['RepositoryAssociationRepositoryCodecommitArgs']]:
        return pulumi.get(self, "codecommit")

    @codecommit.setter
    def codecommit(self, value: Optional[pulumi.Input['RepositoryAssociationRepositoryCodecommitArgs']]):
        pulumi.set(self, "codecommit", value)

    @property
    @pulumi.getter(name="githubEnterpriseServer")
    def github_enterprise_server(self) -> Optional[pulumi.Input['RepositoryAssociationRepositoryGithubEnterpriseServerArgs']]:
        return pulumi.get(self, "github_enterprise_server")

    @github_enterprise_server.setter
    def github_enterprise_server(self, value: Optional[pulumi.Input['RepositoryAssociationRepositoryGithubEnterpriseServerArgs']]):
        pulumi.set(self, "github_enterprise_server", value)

    @property
    @pulumi.getter(name="s3Bucket")
    def s3_bucket(self) -> Optional[pulumi.Input['RepositoryAssociationRepositoryS3BucketArgs']]:
        return pulumi.get(self, "s3_bucket")

    @s3_bucket.setter
    def s3_bucket(self, value: Optional[pulumi.Input['RepositoryAssociationRepositoryS3BucketArgs']]):
        pulumi.set(self, "s3_bucket", value)


if not MYPY:
    class RepositoryAssociationRepositoryBitbucketArgsDict(TypedDict):
        connection_arn: pulumi.Input[str]
        """
        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        """
        name: pulumi.Input[str]
        """
        The name of the third party source repository.
        """
        owner: pulumi.Input[str]
        """
        The username for the account that owns the repository.
        """
elif False:
    RepositoryAssociationRepositoryBitbucketArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationRepositoryBitbucketArgs:
    def __init__(__self__, *,
                 connection_arn: pulumi.Input[str],
                 name: pulumi.Input[str],
                 owner: pulumi.Input[str]):
        """
        :param pulumi.Input[str] connection_arn: The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        :param pulumi.Input[str] name: The name of the third party source repository.
        :param pulumi.Input[str] owner: The username for the account that owns the repository.
        """
        pulumi.set(__self__, "connection_arn", connection_arn)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="connectionArn")
    def connection_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        """
        return pulumi.get(self, "connection_arn")

    @connection_arn.setter
    def connection_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_arn", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the third party source repository.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Input[str]:
        """
        The username for the account that owns the repository.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: pulumi.Input[str]):
        pulumi.set(self, "owner", value)


if not MYPY:
    class RepositoryAssociationRepositoryCodecommitArgsDict(TypedDict):
        name: pulumi.Input[str]
        """
        The name of the AWS CodeCommit repository.
        """
elif False:
    RepositoryAssociationRepositoryCodecommitArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationRepositoryCodecommitArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The name of the AWS CodeCommit repository.
        """
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the AWS CodeCommit repository.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


if not MYPY:
    class RepositoryAssociationRepositoryGithubEnterpriseServerArgsDict(TypedDict):
        connection_arn: pulumi.Input[str]
        """
        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        """
        name: pulumi.Input[str]
        """
        The name of the third party source repository.
        """
        owner: pulumi.Input[str]
        """
        The username for the account that owns the repository.
        """
elif False:
    RepositoryAssociationRepositoryGithubEnterpriseServerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationRepositoryGithubEnterpriseServerArgs:
    def __init__(__self__, *,
                 connection_arn: pulumi.Input[str],
                 name: pulumi.Input[str],
                 owner: pulumi.Input[str]):
        """
        :param pulumi.Input[str] connection_arn: The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        :param pulumi.Input[str] name: The name of the third party source repository.
        :param pulumi.Input[str] owner: The username for the account that owns the repository.
        """
        pulumi.set(__self__, "connection_arn", connection_arn)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="connectionArn")
    def connection_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
        """
        return pulumi.get(self, "connection_arn")

    @connection_arn.setter
    def connection_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_arn", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the third party source repository.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Input[str]:
        """
        The username for the account that owns the repository.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: pulumi.Input[str]):
        pulumi.set(self, "owner", value)


if not MYPY:
    class RepositoryAssociationRepositoryS3BucketArgsDict(TypedDict):
        bucket_name: pulumi.Input[str]
        """
        The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        """
        name: pulumi.Input[str]
        """
        The name of the repository in the S3 bucket.
        """
elif False:
    RepositoryAssociationRepositoryS3BucketArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationRepositoryS3BucketArgs:
    def __init__(__self__, *,
                 bucket_name: pulumi.Input[str],
                 name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] bucket_name: The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        :param pulumi.Input[str] name: The name of the repository in the S3 bucket.
        """
        pulumi.set(__self__, "bucket_name", bucket_name)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Input[str]:
        """
        The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the repository in the S3 bucket.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


if not MYPY:
    class RepositoryAssociationS3RepositoryDetailArgsDict(TypedDict):
        bucket_name: NotRequired[pulumi.Input[str]]
        """
        The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        """
        code_artifacts: NotRequired[pulumi.Input[Sequence[pulumi.Input['RepositoryAssociationS3RepositoryDetailCodeArtifactArgsDict']]]]
elif False:
    RepositoryAssociationS3RepositoryDetailArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationS3RepositoryDetailArgs:
    def __init__(__self__, *,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 code_artifacts: Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryAssociationS3RepositoryDetailCodeArtifactArgs']]]] = None):
        """
        :param pulumi.Input[str] bucket_name: The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        """
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if code_artifacts is not None:
            pulumi.set(__self__, "code_artifacts", code_artifacts)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="codeArtifacts")
    def code_artifacts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryAssociationS3RepositoryDetailCodeArtifactArgs']]]]:
        return pulumi.get(self, "code_artifacts")

    @code_artifacts.setter
    def code_artifacts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryAssociationS3RepositoryDetailCodeArtifactArgs']]]]):
        pulumi.set(self, "code_artifacts", value)


if not MYPY:
    class RepositoryAssociationS3RepositoryDetailCodeArtifactArgsDict(TypedDict):
        build_artifacts_object_key: NotRequired[pulumi.Input[str]]
        source_code_artifacts_object_key: NotRequired[pulumi.Input[str]]
elif False:
    RepositoryAssociationS3RepositoryDetailCodeArtifactArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RepositoryAssociationS3RepositoryDetailCodeArtifactArgs:
    def __init__(__self__, *,
                 build_artifacts_object_key: Optional[pulumi.Input[str]] = None,
                 source_code_artifacts_object_key: Optional[pulumi.Input[str]] = None):
        if build_artifacts_object_key is not None:
            pulumi.set(__self__, "build_artifacts_object_key", build_artifacts_object_key)
        if source_code_artifacts_object_key is not None:
            pulumi.set(__self__, "source_code_artifacts_object_key", source_code_artifacts_object_key)

    @property
    @pulumi.getter(name="buildArtifactsObjectKey")
    def build_artifacts_object_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "build_artifacts_object_key")

    @build_artifacts_object_key.setter
    def build_artifacts_object_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "build_artifacts_object_key", value)

    @property
    @pulumi.getter(name="sourceCodeArtifactsObjectKey")
    def source_code_artifacts_object_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "source_code_artifacts_object_key")

    @source_code_artifacts_object_key.setter
    def source_code_artifacts_object_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_code_artifacts_object_key", value)


