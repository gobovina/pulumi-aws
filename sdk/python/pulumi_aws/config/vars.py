# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

import types

__config__ = pulumi.Config('aws')


class _ExportableConfig(types.ModuleType):
    @property
    def access_key(self) -> Optional[str]:
        """
        The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
        """
        return __config__.get('accessKey')

    @property
    def allowed_account_ids(self) -> Optional[str]:
        return __config__.get('allowedAccountIds')

    @property
    def assume_role(self) -> Optional[str]:
        return __config__.get('assumeRole')

    @property
    def custom_ca_bundle(self) -> Optional[str]:
        """
        File containing custom root and intermediate certificates. Can also be configured using the `AWS_CA_BUNDLE` environment
        variable. (Setting `ca_bundle` in the shared config file is not supported.)
        """
        return __config__.get('customCaBundle')

    @property
    def default_tags(self) -> Optional[str]:
        """
        Configuration block with settings to default resource tags across all resources.
        """
        return __config__.get('defaultTags')

    @property
    def ec2_metadata_service_endpoint(self) -> Optional[str]:
        """
        Address of the EC2 metadata service endpoint to use. Can also be configured using the
        `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
        """
        return __config__.get('ec2MetadataServiceEndpoint')

    @property
    def ec2_metadata_service_endpoint_mode(self) -> Optional[str]:
        """
        Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the
        `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
        """
        return __config__.get('ec2MetadataServiceEndpointMode')

    @property
    def endpoints(self) -> Optional[str]:
        return __config__.get('endpoints')

    @property
    def forbidden_account_ids(self) -> Optional[str]:
        return __config__.get('forbiddenAccountIds')

    @property
    def http_proxy(self) -> Optional[str]:
        """
        The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
        `HTTPS_PROXY` environment variables.
        """
        return __config__.get('httpProxy')

    @property
    def ignore_tags(self) -> Optional[str]:
        """
        Configuration block with settings to ignore resource tags across all resources.
        """
        return __config__.get('ignoreTags')

    @property
    def insecure(self) -> Optional[bool]:
        """
        Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
        """
        return __config__.get_bool('insecure')

    @property
    def max_retries(self) -> Optional[int]:
        """
        The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
        """
        return __config__.get_int('maxRetries')

    @property
    def profile(self) -> Optional[str]:
        """
        The profile for API operations. If not set, the default profile created with `aws configure` will be used.
        """
        return __config__.get('profile') or _utilities.get_env('AWS_PROFILE')

    @property
    def region(self) -> Optional[str]:
        """
        The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
        """
        return __config__.get('region') or _utilities.get_env('AWS_REGION', 'AWS_DEFAULT_REGION')

    @property
    def s3_force_path_style(self) -> Optional[bool]:
        """
        Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
        default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
        Specific to the Amazon S3 service.
        """
        return __config__.get_bool('s3ForcePathStyle')

    @property
    def s3_use_path_style(self) -> Optional[bool]:
        """
        Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
        default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
        Specific to the Amazon S3 service.
        """
        return __config__.get_bool('s3UsePathStyle')

    @property
    def secret_key(self) -> Optional[str]:
        """
        The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
        """
        return __config__.get('secretKey')

    @property
    def shared_config_files(self) -> Optional[str]:
        """
        List of paths to shared config files. If not set, defaults to [~/.aws/config].
        """
        return __config__.get('sharedConfigFiles')

    @property
    def shared_credentials_file(self) -> Optional[str]:
        """
        The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
        """
        return __config__.get('sharedCredentialsFile')

    @property
    def shared_credentials_files(self) -> Optional[str]:
        """
        List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
        """
        return __config__.get('sharedCredentialsFiles')

    @property
    def skip_credentials_validation(self) -> bool:
        """
        Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
        available/implemented.
        """
        return __config__.get_bool('skipCredentialsValidation') or True

    @property
    def skip_get_ec2_platforms(self) -> bool:
        """
        Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
        """
        return __config__.get_bool('skipGetEc2Platforms') or True

    @property
    def skip_metadata_api_check(self) -> bool:
        """
        Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
        """
        return __config__.get_bool('skipMetadataApiCheck') or True

    @property
    def skip_region_validation(self) -> bool:
        """
        Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
        not public (yet).
        """
        return __config__.get_bool('skipRegionValidation') or True

    @property
    def skip_requesting_account_id(self) -> Optional[bool]:
        """
        Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
        """
        return __config__.get_bool('skipRequestingAccountId')

    @property
    def sts_region(self) -> Optional[str]:
        """
        The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
        """
        return __config__.get('stsRegion')

    @property
    def token(self) -> Optional[str]:
        """
        session token. A session token is only required if you are using temporary security credentials.
        """
        return __config__.get('token')

    @property
    def use_dualstack_endpoint(self) -> Optional[bool]:
        """
        Resolve an endpoint with DualStack capability
        """
        return __config__.get_bool('useDualstackEndpoint')

    @property
    def use_fips_endpoint(self) -> Optional[bool]:
        """
        Resolve an endpoint with FIPS capability
        """
        return __config__.get_bool('useFipsEndpoint')

